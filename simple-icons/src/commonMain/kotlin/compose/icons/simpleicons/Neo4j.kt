package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Neo4j: ImageVector
    get() {
        if (_neo4j != null) {
            return _neo4j!!
        }
        _neo4j = Builder(name = "Neo4j", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.629f, 13.227f)
                curveToRelative(-0.593f, 0.0f, -1.139f, 0.2f, -1.58f, 0.533f)
                lineToRelative(-2.892f, -1.976f)
                arcToRelative(2.61f, 2.61f, 0.0f, false, false, 0.101f, -0.711f)
                arcToRelative(2.633f, 2.633f, 0.0f, false, false, -2.629f, -2.629f)
                arcTo(2.632f, 2.632f, 0.0f, false, false, 0.0f, 11.073f)
                arcToRelative(2.632f, 2.632f, 0.0f, false, false, 2.629f, 2.629f)
                curveToRelative(0.593f, 0.0f, 1.139f, -0.2f, 1.579f, -0.533f)
                lineTo(7.1f, 15.145f)
                curveToRelative(-0.063f, 0.226f, -0.1f, 0.465f, -0.1f, 0.711f)
                curveToRelative(0.0f, 0.247f, 0.037f, 0.484f, 0.1f, 0.711f)
                lineToRelative(-2.892f, 1.976f)
                arcToRelative(2.608f, 2.608f, 0.0f, false, false, -1.579f, -0.533f)
                arcTo(2.632f, 2.632f, 0.0f, false, false, 0.0f, 20.639f)
                arcToRelative(2.632f, 2.632f, 0.0f, false, false, 2.629f, 2.629f)
                arcToRelative(2.632f, 2.632f, 0.0f, false, false, 2.629f, -2.629f)
                curveToRelative(0.0f, -0.247f, -0.037f, -0.485f, -0.101f, -0.711f)
                lineToRelative(2.892f, -1.976f)
                curveToRelative(0.441f, 0.333f, 0.987f, 0.533f, 1.58f, 0.533f)
                arcToRelative(2.633f, 2.633f, 0.0f, false, false, 2.629f, -2.629f)
                curveToRelative(0.0f, -1.45f, -1.18f, -2.629f, -2.629f, -2.629f)
                close()
                moveTo(16.112f, 0.732f)
                curveToRelative(-4.72f, 0.0f, -7.888f, 2.748f, -7.888f, 8.082f)
                verticalLineToRelative(3.802f)
                arcToRelative(3.525f, 3.525f, 0.0f, false, true, 3.071f, 0.008f)
                verticalLineToRelative(-3.81f)
                curveToRelative(0.0f, -3.459f, 1.907f, -5.237f, 4.817f, -5.237f)
                reflectiveCurveToRelative(4.817f, 1.778f, 4.817f, 5.237f)
                verticalLineToRelative(8.309f)
                horizontalLineTo(24.0f)
                verticalLineTo(8.814f)
                curveTo(24.0f, 3.448f, 20.832f, 0.732f, 16.112f, 0.732f)
                close()
            }
        }
        .build()
        return _neo4j!!
    }

private var _neo4j: ImageVector? = null
