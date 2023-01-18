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

public val IonIcons.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 112.0f)
                horizontalLineTo(184.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -72.0f, 72.0f)
                verticalLineTo(408.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 72.0f, 72.0f)
                horizontalLineTo(408.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 72.0f, -72.0f)
                verticalLineTo(184.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 408.0f, 112.0f)
                close()
                moveTo(375.55f, 312.0f)
                horizontalLineTo(312.0f)
                verticalLineToRelative(63.55f)
                curveToRelative(0.0f, 8.61f, -6.62f, 16.0f, -15.23f, 16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 280.0f, 376.0f)
                verticalLineTo(312.0f)
                horizontalLineTo(216.45f)
                curveToRelative(-8.61f, 0.0f, -16.0f, -6.62f, -16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 280.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(216.45f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 312.0f, 216.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.77f)
                curveTo(391.58f, 305.38f, 384.16f, 312.0f, 375.55f, 312.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(395.88f, 80.0f)
                arcTo(72.12f, 72.12f, 0.0f, false, false, 328.0f, 32.0f)
                horizontalLineTo(104.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -72.0f, 72.0f)
                verticalLineTo(328.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, false, 48.0f, 67.88f)
                verticalLineTo(160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
