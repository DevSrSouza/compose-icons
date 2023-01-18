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

public val LightGroup.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.1f, 142.1f)
                arcTo(37.6f, 37.6f, 0.0f, false, false, 174.0f, 112.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                arcToRelative(37.6f, 37.6f, 0.0f, false, false, 14.9f, 30.1f)
                arcToRelative(66.4f, 66.4f, 0.0f, false, false, -29.7f, 22.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 7.2f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, 86.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 1.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.2f, -8.4f)
                arcTo(66.4f, 66.4f, 0.0f, false, false, 159.1f, 142.1f)
                close()
                moveTo(110.0f, 112.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 110.0f, 112.0f)
                close()
                moveTo(208.0f, 26.0f)
                lineTo(64.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 40.0f)
                lineTo(50.0f, 62.0f)
                lineTo(32.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 74.0f)
                verticalLineToRelative(28.0f)
                lineTo(32.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 114.0f)
                verticalLineToRelative(28.0f)
                lineTo(32.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 154.0f)
                verticalLineToRelative(28.0f)
                lineTo(32.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 194.0f)
                verticalLineToRelative(22.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 26.0f)
                close()
                moveTo(210.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(64.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(62.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
