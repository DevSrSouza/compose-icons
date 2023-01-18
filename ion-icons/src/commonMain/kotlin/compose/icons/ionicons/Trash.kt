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

public val IonIcons.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 96.0f)
                lineTo(336.0f, 96.0f)
                lineTo(336.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                lineTo(216.0f, 32.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                lineTo(176.0f, 96.0f)
                lineTo(80.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                lineTo(97.0f, 128.0f)
                lineTo(116.0f, 432.92f)
                curveToRelative(1.42f, 26.85f, 22.0f, 47.08f, 48.0f, 47.08f)
                lineTo(348.0f, 480.0f)
                curveToRelative(26.13f, 0.0f, 46.3f, -19.78f, 48.0f, -47.0f)
                lineTo(415.0f, 128.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
                moveTo(192.57f, 416.0f)
                lineTo(192.0f, 416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -15.43f)
                lineToRelative(-8.0f, -224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, -1.14f)
                lineToRelative(8.0f, 224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.57f, 416.0f)
                close()
                moveTo(272.0f, 400.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(240.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(304.0f, 96.0f)
                lineTo(208.0f, 96.0f)
                lineTo(208.0f, 72.0f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(336.0f, 400.57f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 320.0f, 416.0f)
                horizontalLineToRelative(-0.58f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 304.0f, 399.43f)
                lineToRelative(8.0f, -224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 1.14f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
