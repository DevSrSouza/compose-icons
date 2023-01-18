package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BarcodeBoxFill: ImageVector
    get() {
        if (_barcodeBoxFill != null) {
            return _barcodeBoxFill!!
        }
        _barcodeBoxFill = Builder(name = "BarcodeBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                lineTo(9.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(10.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _barcodeBoxFill!!
    }

private var _barcodeBoxFill: ImageVector? = null
