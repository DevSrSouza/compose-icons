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

public val IonIcons.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.82f, 32.45f)
                arcToRelative(16.28f, 16.28f, 0.0f, false, false, -11.23f, 1.37f)
                lineTo(448.0f, 46.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-24.8f, -12.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.31f, 0.0f)
                lineTo(383.78f, 46.11f)
                horizontalLineToRelative(0.0f)
                lineTo(359.0f, 33.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.36f, 0.0f)
                lineTo(320.0f, 46.07f)
                lineTo(320.0f, 46.07f)
                lineTo(295.55f, 33.73f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.35f, -0.06f)
                lineTo(256.0f, 46.12f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-24.8f, -12.43f)
                arcToRelative(16.05f, 16.05f, 0.0f, false, false, -14.33f, 0.0f)
                lineTo(192.0f, 46.1f)
                horizontalLineToRelative(0.0f)
                lineTo(167.16f, 33.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.36f, 3.94f)
                arcTo(16.25f, 16.25f, 0.0f, false, false, 144.0f, 48.28f)
                lineTo(144.0f, 288.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, false, 0.05f, 0.05f)
                lineTo(336.0f, 288.05f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(368.0f, 424.0f)
                curveToRelative(0.0f, 30.93f, 33.07f, 56.0f, 64.0f, 56.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.0f, -52.0f)
                lineTo(496.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 483.82f, 32.45f)
                close()
                moveTo(416.0f, 240.0f)
                lineTo(288.5f, 240.0f)
                curveToRelative(-8.64f, 0.0f, -16.1f, -6.64f, -16.48f, -15.28f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 288.0f, 208.0f)
                lineTo(415.5f, 208.0f)
                curveToRelative(8.64f, 0.0f, 16.1f, 6.64f, 16.48f, 15.28f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 416.0f, 240.0f)
                close()
                moveTo(416.0f, 160.0f)
                lineTo(224.5f, 160.0f)
                curveToRelative(-8.64f, 0.0f, -16.1f, -6.64f, -16.48f, -15.28f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 128.0f)
                lineTo(415.5f, 128.0f)
                curveToRelative(8.64f, 0.0f, 16.1f, 6.64f, 16.48f, 15.28f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 416.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 424.0f)
                verticalLineTo(336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -32.0f, 32.05f)
                curveToRelative(0.0f, 50.55f, 5.78f, 71.57f, 14.46f, 87.57f)
                curveTo(45.19f, 466.79f, 71.86f, 480.0f, 112.0f, 480.0f)
                horizontalLineTo(357.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.85f, -6.81f)
                curveTo(351.07f, 463.7f, 336.0f, 451.0f, 336.0f, 424.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
