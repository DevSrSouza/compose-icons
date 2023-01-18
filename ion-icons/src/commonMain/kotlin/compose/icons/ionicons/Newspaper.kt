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

public val IonIcons.Newspaper: ImageVector
    get() {
        if (_newspaper != null) {
            return _newspaper!!
        }
        _newspaper = Builder(name = "Newspaper", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.91f, 112.0f)
                horizontalLineTo(416.09f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, false, -0.09f, 0.09f)
                verticalLineTo(416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(152.09f)
                arcTo(40.09f, 40.09f, 0.0f, false, false, 439.91f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 416.0f)
                lineTo(384.0f, 72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                lineTo(72.0f, 32.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 32.0f, 72.0f)
                lineTo(32.0f, 424.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                lineTo(430.85f, 480.0f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, 1.15f, -1.15f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, -0.85f, -1.1f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 384.0f, 416.0f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(112.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                close()
                moveTo(304.0f, 400.0f)
                lineTo(112.45f, 400.0f)
                curveToRelative(-8.61f, 0.0f, -16.0f, -6.62f, -16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 368.0f)
                lineTo(303.55f, 368.0f)
                curveToRelative(8.61f, 0.0f, 16.0f, 6.62f, 16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 304.0f, 400.0f)
                close()
                moveTo(304.0f, 336.0f)
                lineTo(112.45f, 336.0f)
                curveToRelative(-8.61f, 0.0f, -16.0f, -6.62f, -16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 304.0f)
                lineTo(303.55f, 304.0f)
                curveToRelative(8.61f, 0.0f, 16.0f, 6.62f, 16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 304.0f, 336.0f)
                close()
                moveTo(304.0f, 272.0f)
                lineTo(112.45f, 272.0f)
                curveToRelative(-8.61f, 0.0f, -16.0f, -6.62f, -16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 240.0f)
                lineTo(303.55f, 240.0f)
                curveToRelative(8.61f, 0.0f, 16.0f, 6.62f, 16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 304.0f, 272.0f)
                close()
                moveTo(304.0f, 208.0f)
                lineTo(240.45f, 208.0f)
                curveToRelative(-8.61f, 0.0f, -16.0f, -6.62f, -16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 176.0f)
                horizontalLineToRelative(63.55f)
                curveToRelative(8.61f, 0.0f, 16.0f, 6.62f, 16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 304.0f, 208.0f)
                close()
                moveTo(304.0f, 144.0f)
                lineTo(240.45f, 144.0f)
                curveToRelative(-8.61f, 0.0f, -16.0f, -6.62f, -16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 112.0f)
                horizontalLineToRelative(63.55f)
                curveToRelative(8.61f, 0.0f, 16.0f, 6.62f, 16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 304.0f, 144.0f)
                close()
            }
        }
        .build()
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
