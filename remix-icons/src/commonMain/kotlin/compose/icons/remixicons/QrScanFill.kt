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

public val RemixIcons.QrScanFill: ImageVector
    get() {
        if (_qrScanFill != null) {
            return _qrScanFill!!
        }
        _qrScanFill = Builder(name = "QrScanFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                verticalLineToRelative(5.007f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, -0.993f, 0.993f)
                lineTo(3.993f, 21.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 3.0f, 20.007f)
                lineTo(3.0f, 15.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                horizontalLineToRelative(16.014f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.445f, 0.993f, 0.993f)
                lineTo(21.0f, 9.0f)
                close()
            }
        }
        .build()
        return _qrScanFill!!
    }

private var _qrScanFill: ImageVector? = null
