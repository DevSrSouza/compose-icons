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

public val IonIcons.Easel: ImageVector
    get() {
        if (_easel != null) {
            return _easel!!
        }
        _easel = Builder(name = "Easel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 112.0f)
                lineTo(420.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 432.0f, 124.0f)
                lineTo(432.0f, 308.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 420.0f, 320.0f)
                lineTo(92.0f, 320.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 308.0f)
                lineTo(80.0f, 124.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 64.0f)
                lineTo(272.0f, 64.0f)
                lineTo(272.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                lineTo(240.0f, 64.0f)
                lineTo(80.0f, 64.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, 48.0f)
                lineTo(32.0f, 320.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(42.79f)
                lineTo(96.62f, 459.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 30.76f, 8.8f)
                lineTo(156.07f, 368.0f)
                lineTo(240.0f, 368.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                lineTo(272.0f, 368.0f)
                horizontalLineToRelative(83.93f)
                lineToRelative(28.69f, 100.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 30.76f, -8.8f)
                lineTo(389.21f, 368.0f)
                lineTo(432.0f, 368.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(480.0f, 112.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 432.0f, 64.0f)
                close()
                moveTo(448.0f, 320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(80.0f, 336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(64.0f, 112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 96.0f)
                lineTo(432.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _easel!!
    }

private var _easel: ImageVector? = null
