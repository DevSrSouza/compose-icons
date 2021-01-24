package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.0f, 196.51f)
                lineTo(6.67f, 268.29f)
                arcTo(26.643f, 26.643f, 0.0f, false, false, 0.0f, 285.93f)
                lineTo(0.0f, 512.0f)
                horizontalLineToRelative(128.0f)
                lineTo(128.0f, 239.58f)
                lineToRelative(-38.0f, -43.07f)
                curveToRelative(-5.31f, -6.01f, -14.69f, -6.01f, -20.0f, 0.0f)
                close()
                moveTo(633.33f, 268.29f)
                lineTo(570.0f, 196.51f)
                curveToRelative(-5.31f, -6.02f, -14.69f, -6.02f, -20.0f, 0.0f)
                lineToRelative(-38.0f, 43.07f)
                lineTo(512.0f, 512.0f)
                horizontalLineToRelative(128.0f)
                lineTo(640.0f, 285.93f)
                curveToRelative(0.0f, -6.5f, -2.37f, -12.77f, -6.67f, -17.64f)
                close()
                moveTo(339.99f, 7.01f)
                curveToRelative(-11.69f, -9.35f, -28.29f, -9.35f, -39.98f, 0.0f)
                lineToRelative(-128.0f, 102.4f)
                arcTo(32.005f, 32.005f, 0.0f, false, false, 160.0f, 134.4f)
                lineTo(160.0f, 512.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(-92.57f)
                curveToRelative(0.0f, -31.88f, 21.78f, -61.43f, 53.25f, -66.55f)
                curveTo(349.34f, 346.35f, 384.0f, 377.13f, 384.0f, 416.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                lineTo(480.0f, 134.4f)
                curveToRelative(0.0f, -9.72f, -4.42f, -18.92f, -12.01f, -24.99f)
                lineToRelative(-128.0f, -102.4f)
                close()
                moveTo(392.06f, 222.56f)
                curveToRelative(1.98f, 3.15f, -0.29f, 7.24f, -4.0f, 7.24f)
                horizontalLineToRelative(-38.94f)
                lineTo(324.0f, 269.79f)
                curveToRelative(-1.85f, 2.95f, -6.15f, 2.95f, -8.0f, 0.0f)
                lineToRelative(-25.12f, -39.98f)
                horizontalLineToRelative(-38.94f)
                curveToRelative(-3.72f, 0.0f, -5.98f, -4.09f, -4.0f, -7.24f)
                lineToRelative(19.2f, -30.56f)
                lineToRelative(-19.2f, -30.56f)
                curveToRelative(-1.98f, -3.15f, 0.29f, -7.24f, 4.0f, -7.24f)
                horizontalLineToRelative(38.94f)
                lineToRelative(25.12f, -40.0f)
                curveToRelative(1.85f, -2.95f, 6.15f, -2.95f, 8.0f, 0.0f)
                lineToRelative(25.12f, 39.98f)
                horizontalLineToRelative(38.95f)
                curveToRelative(3.71f, 0.0f, 5.98f, 4.09f, 4.0f, 7.24f)
                lineTo(372.87f, 192.0f)
                lineToRelative(19.19f, 30.56f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
