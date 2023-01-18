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

public val IonIcons.BagCheck: ImageVector
    get() {
        if (_bagCheck != null) {
            return _bagCheck!!
        }
        _bagCheck = Builder(name = "BagCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(454.65f, 169.4f)
                arcTo(31.82f, 31.82f, 0.0f, false, false, 432.0f, 160.0f)
                horizontalLineTo(368.0f)
                verticalLineTo(144.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, false, -224.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineTo(408.0f)
                curveToRelative(0.0f, 39.0f, 33.0f, 72.0f, 72.0f, 72.0f)
                horizontalLineTo(392.0f)
                arcToRelative(72.22f, 72.22f, 0.0f, false, false, 50.48f, -20.55f)
                arcTo(69.48f, 69.48f, 0.0f, false, false, 464.0f, 409.25f)
                verticalLineTo(192.0f)
                arcTo(31.75f, 31.75f, 0.0f, false, false, 454.65f, 169.4f)
                close()
                moveTo(332.49f, 274.0f)
                lineToRelative(-89.6f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.23f, 6.0f)
                horizontalLineToRelative(-0.26f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.16f, -5.6f)
                lineToRelative(-38.4f, -44.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 24.32f, -20.8f)
                lineTo(230.0f, 350.91f)
                lineTo(307.51f, 254.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 25.0f, 20.0f)
                close()
                moveTo(336.0f, 160.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(144.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bagCheck!!
    }

private var _bagCheck: ImageVector? = null
