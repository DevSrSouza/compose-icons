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

public val MaterialDesignIcons.StateMachine: ImageVector
    get() {
        if (_stateMachine != null) {
            return _stateMachine!!
        }
        _stateMachine = Builder(name = "StateMachine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.27f, 17.05f)
                curveTo(6.72f, 17.58f, 7.0f, 18.25f, 7.0f, 19.0f)
                curveTo(7.0f, 20.66f, 5.66f, 22.0f, 4.0f, 22.0f)
                reflectiveCurveTo(1.0f, 20.66f, 1.0f, 19.0f)
                reflectiveCurveTo(2.34f, 16.0f, 4.0f, 16.0f)
                curveTo(4.18f, 16.0f, 4.36f, 16.0f, 4.53f, 16.05f)
                lineTo(7.6f, 10.69f)
                lineTo(5.86f, 9.7f)
                lineTo(9.95f, 8.58f)
                lineTo(11.07f, 12.67f)
                lineTo(9.33f, 11.68f)
                lineTo(6.27f, 17.05f)
                moveTo(20.0f, 16.0f)
                curveTo(18.7f, 16.0f, 17.6f, 16.84f, 17.18f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                lineTo(8.0f, 19.0f)
                lineTo(11.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.18f)
                curveTo(17.6f, 21.16f, 18.7f, 22.0f, 20.0f, 22.0f)
                curveTo(21.66f, 22.0f, 23.0f, 20.66f, 23.0f, 19.0f)
                reflectiveCurveTo(21.66f, 16.0f, 20.0f, 16.0f)
                moveTo(12.0f, 8.0f)
                curveTo(12.18f, 8.0f, 12.36f, 8.0f, 12.53f, 7.95f)
                lineTo(15.6f, 13.31f)
                lineTo(13.86f, 14.3f)
                lineTo(17.95f, 15.42f)
                lineTo(19.07f, 11.33f)
                lineTo(17.33f, 12.32f)
                lineTo(14.27f, 6.95f)
                curveTo(14.72f, 6.42f, 15.0f, 5.75f, 15.0f, 5.0f)
                curveTo(15.0f, 3.34f, 13.66f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f)
                reflectiveCurveTo(10.34f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _stateMachine!!
    }

private var _stateMachine: ImageVector? = null
