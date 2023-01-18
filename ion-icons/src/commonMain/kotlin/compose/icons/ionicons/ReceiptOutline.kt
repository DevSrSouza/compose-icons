package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ReceiptOutline: ImageVector
    get() {
        if (_receiptOutline != null) {
            return _receiptOutline!!
        }
        _receiptOutline = Builder(name = "ReceiptOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 336.0f)
                lineToRelative(0.0f, -288.0f)
                lineToRelative(32.0f, 16.0f)
                lineToRelative(32.0f, -16.0f)
                lineToRelative(31.94f, 16.0f)
                lineToRelative(32.37f, -16.0f)
                lineToRelative(31.69f, 16.0f)
                lineToRelative(31.79f, -16.0f)
                lineToRelative(31.93f, 16.0f)
                lineToRelative(32.28f, -16.0f)
                lineToRelative(32.01f, 16.0f)
                lineToRelative(31.99f, -16.0f)
                lineToRelative(0.0f, 224.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(480.0f, 272.0f)
                verticalLineTo(384.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, -80.0f)
                verticalLineTo(336.0f)
                horizontalLineTo(48.0f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, -16.0f, 16.0f)
                curveToRelative(0.0f, 64.0f, 6.74f, 112.0f, 80.0f, 112.0f)
                horizontalLineTo(400.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 144.0f)
                lineTo(416.0f, 144.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(288.0f, 224.0f)
                lineTo(416.0f, 224.0f)
            }
        }
        .build()
        return _receiptOutline!!
    }

private var _receiptOutline: ImageVector? = null
