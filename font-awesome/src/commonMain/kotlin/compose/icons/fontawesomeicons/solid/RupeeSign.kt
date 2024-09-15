package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.RupeeSign: ImageVector
    get() {
        if (_rupeeSign != null) {
            return _rupeeSign!!
        }
        _rupeeSign = Builder(name = "RupeeSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(308.0f, 96.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineTo(44.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(12.0f)
                curveTo(5.37f, 32.0f, 0.0f, 37.37f, 0.0f, 44.0f)
                verticalLineToRelative(44.75f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(85.28f)
                curveToRelative(27.31f, 0.0f, 48.26f, 9.96f, 60.97f, 27.25f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(158.76f)
                curveToRelative(-6.22f, 36.09f, -32.96f, 58.63f, -74.76f, 58.63f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(53.01f)
                curveToRelative(0.0f, 3.35f, 1.4f, 6.55f, 3.86f, 8.82f)
                lineToRelative(165.05f, 152.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.14f, 3.18f)
                horizontalLineToRelative(82.56f)
                curveToRelative(10.92f, 0.0f, 16.17f, -13.41f, 8.14f, -20.82f)
                lineTo(116.87f, 319.91f)
                curveToRelative(76.5f, -2.34f, 131.14f, -53.4f, 138.32f, -127.91f)
                horizontalLineTo(308.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, -5.37f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-58.69f)
                curveToRelative(-3.49f, -11.54f, -8.28f, -22.25f, -14.25f, -32.0f)
                horizontalLineTo(308.0f)
                close()
            }
        }
        .build()
        return _rupeeSign!!
    }

private var _rupeeSign: ImageVector? = null
