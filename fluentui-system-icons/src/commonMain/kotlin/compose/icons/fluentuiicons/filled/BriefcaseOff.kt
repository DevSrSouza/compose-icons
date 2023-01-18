package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.BriefcaseOff: ImageVector
    get() {
        if (_briefcaseOff != null) {
            return _briefcaseOff!!
        }
        _briefcaseOff = Builder(name = "BriefcaseOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9875f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(5.9527f, 7.0134f)
                curveTo(4.2971f, 7.1635f, 3.0f, 8.5553f, 3.0f, 10.2499f)
                verticalLineTo(16.7499f)
                curveTo(3.0f, 18.5448f, 4.4551f, 19.9999f, 6.2501f, 19.9999f)
                horizontalLineTo(17.7502f)
                curveTo(18.1081f, 19.9999f, 18.4525f, 19.942f, 18.7745f, 19.8352f)
                lineTo(20.7196f, 21.7803f)
                curveTo(21.0125f, 22.0732f, 21.4874f, 22.0732f, 21.7803f, 21.7803f)
                curveTo(22.0732f, 21.4874f, 22.0732f, 21.0126f, 21.7803f, 20.7197f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(21.0002f, 16.7499f)
                curveTo(21.0002f, 17.074f, 20.9528f, 17.387f, 20.8645f, 17.6823f)
                lineTo(10.1821f, 7.0f)
                horizontalLineTo(14.5001f)
                verticalLineTo(4.5f)
                horizontalLineTo(9.5001f)
                verticalLineTo(6.3179f)
                lineTo(8.0001f, 4.8179f)
                verticalLineTo(3.75f)
                curveTo(8.0001f, 3.3703f, 8.2822f, 3.0565f, 8.6483f, 3.0069f)
                lineTo(8.7501f, 3.0f)
                horizontalLineTo(15.2501f)
                curveTo(15.6644f, 3.0f, 16.0002f, 3.3358f, 16.0002f, 3.75f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.7502f)
                curveTo(19.5451f, 7.0f, 21.0002f, 8.455f, 21.0002f, 10.2499f)
                verticalLineTo(16.7499f)
                close()
            }
        }
        .build()
        return _briefcaseOff!!
    }

private var _briefcaseOff: ImageVector? = null
