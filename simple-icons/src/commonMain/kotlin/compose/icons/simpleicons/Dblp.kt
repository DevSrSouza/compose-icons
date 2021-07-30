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

public val SimpleIcons.Dblp: ImageVector
    get() {
        if (_dblp != null) {
            return _dblp!!
        }
        _dblp = Builder(name = "Dblp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.075f, 0.002f)
                curveToRelative(-0.096f, 0.013f, -0.154f, 0.092f, -0.094f, 0.31f)
                lineTo(4.97f, 7.73f)
                lineTo(3.1f, 8.6f)
                reflectiveCurveToRelative(-0.56f, 0.26f, -0.4f, 0.85f)
                lineToRelative(2.45f, 9.159f)
                reflectiveCurveToRelative(0.16f, 0.59f, 0.72f, 0.33f)
                lineToRelative(6.169f, -2.869f)
                lineToRelative(1.3f, -0.61f)
                reflectiveCurveToRelative(0.52f, -0.24f, 0.42f, -0.79f)
                lineToRelative(-0.01f, -0.06f)
                lineToRelative(-1.13f, -4.22f)
                lineToRelative(-0.658f, -2.45f)
                lineToRelative(-0.672f, -2.49f)
                verticalLineToRelative(-0.04f)
                reflectiveCurveToRelative(-0.16f, -0.59f, -0.84f, -1.0f)
                lineTo(3.5f, 0.141f)
                reflectiveCurveToRelative(-0.265f, -0.16f, -0.425f, -0.139f)
                close()
                moveTo(18.324f, 5.03f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, -0.193f, 0.06f)
                lineToRelative(-5.602f, 2.6f)
                lineToRelative(0.862f, 3.2f)
                lineToRelative(1.09f, 4.08f)
                lineToRelative(0.01f, 0.06f)
                curveToRelative(0.05f, 0.47f, -0.411f, 0.79f, -0.411f, 0.79f)
                lineToRelative(-1.88f, 0.87f)
                lineToRelative(0.5f, 1.89f)
                lineToRelative(0.04f, 0.1f)
                curveToRelative(0.07f, 0.17f, 0.28f, 0.6f, 0.81f, 0.91f)
                lineToRelative(6.95f, 4.269f)
                reflectiveCurveToRelative(0.68f, 0.41f, 0.52f, -0.17f)
                lineToRelative(-1.981f, -7.4f)
                lineToRelative(1.861f, -0.86f)
                reflectiveCurveToRelative(0.56f, -0.26f, 0.4f, -0.85f)
                lineTo(18.85f, 5.42f)
                reflectiveCurveToRelative(-0.116f, -0.452f, -0.526f, -0.39f)
                close()
            }
        }
        .build()
        return _dblp!!
    }

private var _dblp: ImageVector? = null
