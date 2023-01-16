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

public val MaterialDesignIcons.ChairSchool: ImageVector
    get() {
        if (_chairSchool != null) {
            return _chairSchool!!
        }
        _chairSchool = Builder(name = "ChairSchool", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                lineTo(13.53f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.46f)
                lineTo(18.17f, 22.0f)
                horizontalLineTo(15.97f)
                lineTo(15.04f, 20.0f)
                horizontalLineTo(6.38f)
                lineTo(5.35f, 22.0f)
                horizontalLineTo(3.1f)
                lineTo(7.23f, 14.0f)
                horizontalLineTo(7.0f)
                curveTo(6.55f, 14.0f, 6.17f, 13.7f, 6.04f, 13.3f)
                lineTo(2.87f, 3.84f)
                lineTo(3.82f, 3.5f)
                curveTo(4.34f, 3.34f, 4.91f, 3.63f, 5.08f, 4.15f)
                lineTo(7.72f, 12.0f)
                horizontalLineTo(12.1f)
                lineTo(15.57f, 7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.0f)
                moveTo(9.5f, 14.0f)
                lineTo(7.42f, 18.0f)
                horizontalLineTo(14.11f)
                lineTo(12.26f, 14.0f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _chairSchool!!
    }

private var _chairSchool: ImageVector? = null
