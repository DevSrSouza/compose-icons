package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Barcode: ImageVector
    get() {
        if (_barcode != null) {
            return _barcode!!
        }
        _barcode = Builder(name = "Barcode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(419.13f, 96.0f)
                lineTo(419.0f, 96.0f)
                lineToRelative(-35.05f, 0.33f)
                lineTo(128.0f, 96.0f)
                horizontalLineToRelative(-0.16f)
                lineToRelative(-36.74f, 0.33f)
                curveTo(66.93f, 96.38f, 48.0f, 116.07f, 48.0f, 141.2f)
                lineTo(48.0f, 371.47f)
                curveToRelative(0.0f, 25.15f, 19.0f, 44.86f, 43.2f, 44.86f)
                horizontalLineToRelative(0.15f)
                lineToRelative(36.71f, -0.33f)
                lineToRelative(255.92f, 0.33f)
                horizontalLineToRelative(0.17f)
                lineToRelative(35.07f, -0.33f)
                arcTo(44.91f, 44.91f, 0.0f, false, false, 464.0f, 371.13f)
                lineTo(464.0f, 140.87f)
                arcTo(44.92f, 44.92f, 0.0f, false, false, 419.13f, 96.0f)
                close()
                moveTo(144.0f, 320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(112.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(208.0f, 352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(176.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(272.0f, 336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(240.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(336.0f, 352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(304.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(400.0f, 320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(368.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _barcode!!
    }

private var _barcode: ImageVector? = null
