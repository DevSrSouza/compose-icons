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

public val SolidGroup.Barcode: ImageVector
    get() {
        if (_barcode != null) {
            return _barcode!!
        }
        _barcode = Builder(name = "Barcode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 448.0f)
                lineTo(0.0f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(384.0f)
                lineTo(0.0f, 448.0f)
                close()
                moveTo(26.86f, 447.73f)
                lineTo(26.86f, 64.0f)
                lineTo(36.0f, 64.0f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-9.14f)
                close()
                moveTo(54.0f, 447.73f)
                lineTo(54.0f, 64.0f)
                horizontalLineToRelative(8.86f)
                verticalLineToRelative(383.73f)
                lineTo(54.0f, 447.73f)
                close()
                moveTo(98.86f, 447.73f)
                lineTo(98.86f, 64.0f)
                horizontalLineToRelative(8.86f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-8.86f)
                close()
                moveTo(134.86f, 447.73f)
                lineTo(134.86f, 64.0f)
                horizontalLineToRelative(17.71f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-17.71f)
                close()
                moveTo(179.71f, 447.73f)
                lineTo(179.71f, 64.0f)
                horizontalLineToRelative(8.86f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-8.86f)
                close()
                moveTo(197.71f, 447.73f)
                lineTo(197.71f, 64.0f)
                horizontalLineToRelative(8.86f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-8.86f)
                close()
                moveTo(215.71f, 447.73f)
                lineTo(215.71f, 64.0f)
                horizontalLineToRelative(8.86f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-8.86f)
                close()
                moveTo(251.43f, 447.73f)
                lineTo(251.43f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(296.29f, 447.73f)
                lineTo(296.29f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(332.28f, 447.73f)
                lineTo(332.28f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(368.29f, 447.73f)
                lineTo(368.29f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(395.14f, 447.73f)
                lineTo(395.14f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(440.29f, 447.73f)
                lineTo(440.29f, 64.0f)
                horizontalLineToRelative(26.86f)
                verticalLineToRelative(383.73f)
                horizontalLineToRelative(-26.86f)
                close()
                moveTo(476.0f, 447.73f)
                lineTo(476.0f, 64.0f)
                horizontalLineToRelative(9.14f)
                verticalLineToRelative(383.73f)
                lineTo(476.0f, 447.73f)
                close()
                moveTo(494.0f, 448.0f)
                lineTo(494.0f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(384.0f)
                horizontalLineToRelative(-18.0f)
                close()
            }
        }
        .build()
        return _barcode!!
    }

private var _barcode: ImageVector? = null
