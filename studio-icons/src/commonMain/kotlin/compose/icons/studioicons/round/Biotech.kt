package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Biotech: ImageVector
    get() {
        if (_biotech != null) {
            return _biotech!!
        }
        _biotech = Builder(name = "Biotech", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.09f, 0.59f, -2.04f, 1.46f, -2.56f)
                curveTo(8.17f, 9.03f, 8.0f, 8.54f, 8.0f, 8.0f)
                curveToRelative(0.0f, -0.21f, 0.04f, -0.42f, 0.09f, -0.62f)
                curveTo(6.28f, 8.13f, 5.0f, 9.92f, 5.0f, 12.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.56f, 5.51f)
                curveTo(11.91f, 5.54f, 13.0f, 6.64f, 13.0f, 8.0f)
                curveToRelative(0.0f, 0.75f, -0.33f, 1.41f, -0.85f, 1.87f)
                lineToRelative(0.25f, 0.68f)
                curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f)
                curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f)
                curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f)
                curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f)
                lineTo(14.1f, 3.54f)
                curveToRelative(-0.19f, -0.52f, -0.76f, -0.79f, -1.28f, -0.6f)
                curveToRelative(-0.19f, -0.52f, -0.76f, -0.79f, -1.28f, -0.6f)
                curveToRelative(-0.52f, 0.19f, -0.79f, 0.76f, -0.6f, 1.28f)
                curveToRelative(-0.52f, 0.19f, -0.79f, 0.76f, -0.6f, 1.28f)
                lineTo(10.56f, 5.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 8.0f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _biotech!!
    }

private var _biotech: ImageVector? = null
