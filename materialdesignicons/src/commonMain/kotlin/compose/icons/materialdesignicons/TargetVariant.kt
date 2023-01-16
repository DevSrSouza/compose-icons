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

public val MaterialDesignIcons.TargetVariant: ImageVector
    get() {
        if (_targetVariant != null) {
            return _targetVariant!!
        }
        _targetVariant = Builder(name = "TargetVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.08f, 11.04f)
                horizontalLineTo(20.08f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.05f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.04f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.04f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.05f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.08f)
                horizontalLineTo(11.04f)
                verticalLineTo(22.08f)
                horizontalLineTo(13.05f)
                verticalLineTo(20.08f)
                horizontalLineTo(20.08f)
                verticalLineTo(13.05f)
                horizontalLineTo(22.08f)
                verticalLineTo(11.04f)
                moveTo(18.07f, 18.07f)
                horizontalLineTo(13.05f)
                verticalLineTo(16.06f)
                horizontalLineTo(11.04f)
                verticalLineTo(18.07f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.05f)
                horizontalLineTo(8.03f)
                verticalLineTo(11.04f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.04f)
                verticalLineTo(8.03f)
                horizontalLineTo(13.05f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.07f)
                verticalLineTo(11.04f)
                horizontalLineTo(16.06f)
                verticalLineTo(13.05f)
                horizontalLineTo(18.07f)
                verticalLineTo(18.07f)
                moveTo(13.05f, 12.05f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.05f, 13.05f)
                curveTo(11.5f, 13.05f, 11.04f, 12.6f, 11.04f, 12.05f)
                curveTo(11.04f, 11.5f, 11.5f, 11.04f, 12.05f, 11.04f)
                curveTo(12.6f, 11.04f, 13.05f, 11.5f, 13.05f, 12.05f)
                close()
            }
        }
        .build()
        return _targetVariant!!
    }

private var _targetVariant: ImageVector? = null
