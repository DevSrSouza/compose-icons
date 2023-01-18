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

public val FilledGroup.Patient: ImageVector
    get() {
        if (_patient != null) {
            return _patient!!
        }
        _patient = Builder(name = "Patient", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 2.0f)
                curveTo(18.9926f, 2.0f, 20.0f, 3.0074f, 20.0f, 4.25f)
                verticalLineTo(19.7546f)
                curveTo(20.0f, 20.9972f, 18.9926f, 22.0046f, 17.75f, 22.0046f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0046f, 4.0f, 20.9972f, 4.0f, 19.7546f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0591f, 4.9252f, 2.0844f, 6.096f, 2.0052f)
                lineTo(6.25f, 2.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(18.5f, 16.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(19.7546f)
                curveTo(5.5f, 20.1688f, 5.8358f, 20.5046f, 6.25f, 20.5046f)
                horizontalLineTo(17.75f)
                curveTo(18.1642f, 20.5046f, 18.5f, 20.1688f, 18.5f, 19.7546f)
                verticalLineTo(16.0f)
                close()
                moveTo(7.7513f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(16.6642f, 17.5f, 17.0f, 17.8358f, 17.0f, 18.25f)
                curveTo(17.0f, 18.6297f, 16.7178f, 18.9435f, 16.3518f, 18.9932f)
                lineTo(16.25f, 19.0f)
                horizontalLineTo(7.7513f)
                curveTo(7.3371f, 19.0f, 7.0013f, 18.6642f, 7.0013f, 18.25f)
                curveTo(7.0013f, 17.8703f, 7.2834f, 17.5565f, 7.6495f, 17.5068f)
                lineTo(7.7513f, 17.5f)
                horizontalLineTo(16.25f)
                horizontalLineTo(7.7513f)
                close()
                moveTo(17.75f, 3.5f)
                horizontalLineTo(6.25f)
                lineTo(6.1482f, 3.5069f)
                curveTo(5.7821f, 3.5565f, 5.5f, 3.8703f, 5.5f, 4.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.2455f)
                curveTo(8.0f, 11.5983f, 8.4919f, 11.066f, 9.1222f, 11.002f)
                lineTo(9.25f, 10.9955f)
                horizontalLineTo(14.75f)
                curveTo(15.3972f, 10.9955f, 15.9295f, 11.4874f, 15.9935f, 12.1177f)
                lineTo(16.0f, 12.2455f)
                verticalLineTo(14.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(4.25f)
                curveTo(18.5f, 3.8358f, 18.1642f, 3.5f, 17.75f, 3.5f)
                close()
                moveTo(12.0f, 4.9955f)
                curveTo(13.3807f, 4.9955f, 14.5f, 6.1148f, 14.5f, 7.4955f)
                curveTo(14.5f, 8.8762f, 13.3807f, 9.9955f, 12.0f, 9.9955f)
                curveTo(10.6193f, 9.9955f, 9.5f, 8.8762f, 9.5f, 7.4955f)
                curveTo(9.5f, 6.1148f, 10.6193f, 4.9955f, 12.0f, 4.9955f)
                close()
            }
        }
        .build()
        return _patient!!
    }

private var _patient: ImageVector? = null
