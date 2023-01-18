package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.7f, 76.0f)
                lineTo(196.0f, 76.0f)
                lineTo(196.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(64.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(60.0f, 76.0f)
                lineTo(45.3f, 76.0f)
                curveTo(33.6f, 76.0f, 24.0f, 85.0f, 24.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(60.0f, 180.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(196.0f, 180.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(232.0f, 96.0f)
                curveTo(232.0f, 85.0f, 222.4f, 76.0f, 210.7f, 76.0f)
                close()
                moveTo(68.0f, 44.0f)
                lineTo(188.0f, 44.0f)
                lineTo(188.0f, 76.0f)
                lineTo(68.0f, 76.0f)
                close()
                moveTo(188.0f, 216.0f)
                lineTo(68.0f, 216.0f)
                lineTo(68.0f, 156.0f)
                lineTo(188.0f, 156.0f)
                close()
                moveTo(224.0f, 172.0f)
                lineTo(196.0f, 172.0f)
                lineTo(196.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(64.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(32.0f, 172.0f)
                lineTo(32.0f, 96.0f)
                curveToRelative(0.0f, -6.6f, 6.0f, -12.0f, 13.3f, -12.0f)
                lineTo(210.7f, 84.0f)
                curveTo(218.0f, 84.0f, 224.0f, 89.4f, 224.0f, 96.0f)
                close()
                moveTo(196.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 116.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
