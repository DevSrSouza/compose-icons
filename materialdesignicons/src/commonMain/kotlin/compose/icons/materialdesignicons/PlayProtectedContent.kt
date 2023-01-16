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

public val MaterialDesignIcons.PlayProtectedContent: ImageVector
    get() {
        if (_playProtectedContent != null) {
            return _playProtectedContent!!
        }
        _playProtectedContent = Builder(name = "PlayProtectedContent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                moveTo(9.0f, 9.0f)
                verticalLineTo(14.0f)
                lineTo(12.5f, 11.5f)
                lineTo(9.0f, 9.0f)
                moveTo(21.04f, 11.67f)
                lineTo(16.09f, 16.62f)
                lineTo(13.96f, 14.5f)
                lineTo(12.55f, 15.91f)
                lineTo(16.09f, 19.45f)
                lineTo(22.45f, 13.09f)
                lineTo(21.04f, 11.67f)
                close()
            }
        }
        .build()
        return _playProtectedContent!!
    }

private var _playProtectedContent: ImageVector? = null
