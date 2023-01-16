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

public val MaterialDesignIcons.Angularjs: ImageVector
    get() {
        if (_angularjs != null) {
            return _angularjs!!
        }
        _angularjs = Builder(name = "Angularjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                lineTo(20.84f, 5.65f)
                lineTo(19.5f, 17.35f)
                lineTo(12.0f, 21.5f)
                lineTo(4.5f, 17.35f)
                lineTo(3.16f, 5.65f)
                lineTo(12.0f, 2.5f)
                moveTo(12.0f, 4.5f)
                lineTo(5.0f, 7.0f)
                lineTo(6.08f, 16.22f)
                lineTo(12.0f, 19.5f)
                lineTo(17.92f, 16.22f)
                lineTo(19.0f, 7.0f)
                lineTo(12.0f, 4.5f)
                moveTo(12.0f, 5.72f)
                lineTo(16.58f, 16.0f)
                horizontalLineTo(14.87f)
                lineTo(13.94f, 13.72f)
                horizontalLineTo(10.04f)
                lineTo(9.12f, 16.0f)
                horizontalLineTo(7.41f)
                lineTo(12.0f, 5.72f)
                moveTo(13.34f, 12.3f)
                lineTo(12.0f, 9.07f)
                lineTo(10.66f, 12.3f)
                horizontalLineTo(13.34f)
                close()
            }
        }
        .build()
        return _angularjs!!
    }

private var _angularjs: ImageVector? = null
