package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.7f, 74.0f)
                lineTo(198.0f, 74.0f)
                lineTo(198.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(64.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(58.0f, 74.0f)
                lineTo(45.3f, 74.0f)
                curveTo(32.5f, 74.0f, 22.0f, 83.9f, 22.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(58.0f, 182.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(192.0f, 226.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(198.0f, 182.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(234.0f, 96.0f)
                curveTo(234.0f, 83.9f, 223.5f, 74.0f, 210.7f, 74.0f)
                close()
                moveTo(70.0f, 46.0f)
                lineTo(186.0f, 46.0f)
                lineTo(186.0f, 74.0f)
                lineTo(70.0f, 74.0f)
                close()
                moveTo(186.0f, 214.0f)
                lineTo(70.0f, 214.0f)
                lineTo(70.0f, 158.0f)
                lineTo(186.0f, 158.0f)
                close()
                moveTo(222.0f, 170.0f)
                lineTo(198.0f, 170.0f)
                lineTo(198.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(64.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                lineTo(34.0f, 170.0f)
                lineTo(34.0f, 96.0f)
                curveToRelative(0.0f, -5.5f, 5.1f, -10.0f, 11.3f, -10.0f)
                lineTo(210.7f, 86.0f)
                curveToRelative(6.2f, 0.0f, 11.3f, 4.5f, 11.3f, 10.0f)
                close()
                moveTo(198.0f, 116.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 198.0f, 116.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
