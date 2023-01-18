package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ReceiptSharp: ImageVector
    get() {
        if (_receiptSharp != null) {
            return _receiptSharp!!
        }
        _receiptSharp = Builder(name = "ReceiptSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 48.0f)
                lineTo(416.0f, 32.0f)
                lineTo(384.0f, 48.0f)
                lineTo(352.0f, 32.0f)
                lineTo(320.0f, 48.0f)
                lineTo(288.0f, 32.0f)
                lineTo(256.0f, 48.0f)
                lineTo(224.0f, 32.0f)
                lineTo(192.0f, 48.0f)
                lineTo(144.0f, 32.0f)
                lineTo(144.0f, 288.0f)
                reflectiveCurveToRelative(0.0f, 0.05f, 0.0f, 0.05f)
                lineTo(368.0f, 288.05f)
                lineTo(368.0f, 424.0f)
                curveToRelative(0.0f, 30.93f, 33.07f, 56.0f, 64.0f, 56.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(30.93f, 0.0f, 52.0f, -25.07f, 52.0f, -56.0f)
                lineTo(496.0f, 32.0f)
                close()
                moveTo(272.5f, 240.0f)
                lineToRelative(-0.5f, -32.0f)
                lineTo(431.5f, 208.0f)
                lineToRelative(0.5f, 32.0f)
                close()
                moveTo(208.5f, 160.0f)
                lineTo(208.0f, 128.0f)
                lineTo(431.5f, 128.0f)
                lineToRelative(0.5f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 424.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 50.55f, 5.78f, 71.62f, 14.46f, 87.63f)
                curveTo(45.19f, 466.8f, 71.86f, 480.0f, 112.0f, 480.0f)
                horizontalLineTo(368.0f)
                reflectiveCurveTo(336.0f, 460.0f, 336.0f, 424.0f)
                close()
            }
        }
        .build()
        return _receiptSharp!!
    }

private var _receiptSharp: ImageVector? = null
