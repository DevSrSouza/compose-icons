package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = Builder(name = "Voicemail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 15.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 11.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 22.0f, 11.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 15.0f)
                moveTo(5.5f, 15.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 2.0f, 11.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.0f, 11.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 15.0f)
                moveTo(18.5f, 6.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 13.0f, 11.5f)
                curveTo(13.0f, 12.83f, 13.47f, 14.05f, 14.26f, 15.0f)
                horizontalLineTo(9.74f)
                curveTo(10.53f, 14.05f, 11.0f, 12.83f, 11.0f, 11.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.5f, 6.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.5f, 17.0f)
                horizontalLineTo(18.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 24.0f, 11.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 18.5f, 6.0f)
                close()
            }
        }
        .build()
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
