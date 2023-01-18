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

public val IonIcons.Calculator: ImageVector
    get() {
        if (_calculator != null) {
            return _calculator!!
        }
        _calculator = Builder(name = "Calculator", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 80.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, -48.0f)
                lineTo(144.0f, 32.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 96.0f, 80.0f)
                lineTo(96.0f, 432.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                lineTo(368.0f, 480.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.0f)
                close()
                moveTo(168.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 432.0f)
                close()
                moveTo(168.0f, 352.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 352.0f)
                close()
                moveTo(168.0f, 272.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 272.0f)
                close()
                moveTo(256.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 256.0f, 432.0f)
                close()
                moveTo(256.0f, 352.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 256.0f, 352.0f)
                close()
                moveTo(256.0f, 272.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 256.0f, 272.0f)
                close()
                moveTo(368.0f, 408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                lineTo(320.0f, 328.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                close()
                moveTo(344.0f, 272.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 344.0f, 272.0f)
                close()
                moveTo(363.31f, 171.31f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 352.0f, 176.0f)
                lineTo(160.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(144.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(352.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 363.31f, 171.31f)
                close()
            }
        }
        .build()
        return _calculator!!
    }

private var _calculator: ImageVector? = null
