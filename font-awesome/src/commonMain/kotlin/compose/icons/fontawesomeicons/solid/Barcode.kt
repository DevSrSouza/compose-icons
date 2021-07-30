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
                moveTo(26.857f, 447.727f)
                lineTo(26.857f, 64.0f)
                lineTo(36.0f, 64.0f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-9.143f)
                close()
                moveTo(54.0f, 447.727f)
                lineTo(54.0f, 64.0f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                lineTo(54.0f, 447.727f)
                close()
                moveTo(98.857f, 447.727f)
                lineTo(98.857f, 64.0f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-8.857f)
                close()
                moveTo(134.857f, 447.727f)
                lineTo(134.857f, 64.0f)
                horizontalLineToRelative(17.714f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-17.714f)
                close()
                moveTo(179.714f, 447.727f)
                lineTo(179.714f, 64.0f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-8.857f)
                close()
                moveTo(197.714f, 447.727f)
                lineTo(197.714f, 64.0f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-8.857f)
                close()
                moveTo(215.714f, 447.727f)
                lineTo(215.714f, 64.0f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-8.857f)
                close()
                moveTo(251.429f, 447.727f)
                lineTo(251.429f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(296.286f, 447.727f)
                lineTo(296.286f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(332.285f, 447.727f)
                lineTo(332.285f, 64.0f)
                horizontalLineToRelative(18.001f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18.001f)
                close()
                moveTo(368.286f, 447.727f)
                lineTo(368.286f, 64.0f)
                horizontalLineToRelative(18.001f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18.001f)
                close()
                moveTo(395.143f, 447.727f)
                lineTo(395.143f, 64.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18.0f)
                close()
                moveTo(440.286f, 447.727f)
                lineTo(440.286f, 64.0f)
                horizontalLineToRelative(26.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-26.857f)
                close()
                moveTo(476.0f, 447.727f)
                lineTo(476.0f, 64.0f)
                horizontalLineToRelative(9.143f)
                verticalLineToRelative(383.727f)
                lineTo(476.0f, 447.727f)
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
