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

public val MaterialDesignIcons.CoachLampVariant: ImageVector
    get() {
        if (_coachLampVariant != null) {
            return _coachLampVariant!!
        }
        _coachLampVariant = Builder(name = "CoachLampVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                lineTo(12.0f, 4.0f)
                lineTo(10.0f, 6.31f)
                lineTo(5.0f, 9.0f)
                horizontalLineTo(7.0f)
                lineTo(9.5f, 18.0f)
                lineTo(12.0f, 20.0f)
                lineTo(12.5f, 22.0f)
                horizontalLineTo(13.5f)
                lineTo(14.0f, 20.0f)
                lineTo(16.5f, 18.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineTo(21.0f)
                lineTo(16.0f, 6.31f)
                lineTo(14.0f, 4.0f)
                lineTo(13.5f, 2.0f)
                moveTo(9.0f, 9.0f)
                horizontalLineTo(17.0f)
                lineTo(14.78f, 17.0f)
                horizontalLineTo(11.22f)
                moveTo(3.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.5f)
                lineTo(11.0f, 20.0f)
                horizontalLineTo(8.0f)
                lineTo(5.0f, 17.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _coachLampVariant!!
    }

private var _coachLampVariant: ImageVector? = null
