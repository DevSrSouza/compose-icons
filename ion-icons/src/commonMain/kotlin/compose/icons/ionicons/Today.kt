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

public val IonIcons.Today: ImageVector
    get() {
        if (_today != null) {
            return _today!!
        }
        _today = Builder(name = "Today", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 64.0f)
                horizontalLineTo(400.0f)
                verticalLineTo(48.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 368.0f, 48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(48.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 112.0f, 48.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(476.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(128.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 416.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.0f, 176.0f)
                horizontalLineTo(35.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineTo(416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(179.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 477.0f, 176.0f)
                close()
                moveTo(224.0f, 307.43f)
                arcTo(28.57f, 28.57f, 0.0f, false, true, 195.43f, 336.0f)
                horizontalLineTo(124.57f)
                arcTo(28.57f, 28.57f, 0.0f, false, true, 96.0f, 307.43f)
                verticalLineTo(236.57f)
                arcTo(28.57f, 28.57f, 0.0f, false, true, 124.57f, 208.0f)
                horizontalLineToRelative(70.86f)
                arcTo(28.57f, 28.57f, 0.0f, false, true, 224.0f, 236.57f)
                close()
            }
        }
        .build()
        return _today!!
    }

private var _today: ImageVector? = null
