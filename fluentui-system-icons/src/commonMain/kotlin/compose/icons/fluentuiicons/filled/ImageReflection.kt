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

public val FilledGroup.ImageReflection: ImageVector
    get() {
        if (_imageReflection != null) {
            return _imageReflection!!
        }
        _imageReflection = Builder(name = "ImageReflection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.25f)
                curveTo(4.0f, 4.4551f, 5.4551f, 3.0f, 7.25f, 3.0f)
                horizontalLineTo(16.75f)
                curveTo(18.5449f, 3.0f, 20.0f, 4.4551f, 20.0f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(20.0f, 16.2552f, 19.5436f, 17.1539f, 18.8268f, 17.75f)
                curveTo(19.5436f, 18.3462f, 20.0f, 19.2448f, 20.0f, 20.25f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.4142f, 19.6642f, 21.75f, 19.25f, 21.75f)
                curveTo(18.8358f, 21.75f, 18.5f, 21.4142f, 18.5f, 21.0f)
                verticalLineTo(20.25f)
                curveTo(18.5f, 19.2835f, 17.7165f, 18.5f, 16.75f, 18.5f)
                horizontalLineTo(15.75f)
                curveTo(15.3358f, 18.5f, 15.0f, 18.1642f, 15.0f, 17.75f)
                curveTo(15.0f, 17.6623f, 15.015f, 17.5782f, 15.0427f, 17.5f)
                horizontalLineTo(13.4573f)
                curveTo(13.485f, 17.5782f, 13.5f, 17.6623f, 13.5f, 17.75f)
                curveTo(13.5f, 18.1642f, 13.1642f, 18.5f, 12.75f, 18.5f)
                horizontalLineTo(11.25f)
                curveTo(10.8358f, 18.5f, 10.5f, 18.1642f, 10.5f, 17.75f)
                curveTo(10.5f, 17.6623f, 10.515f, 17.5782f, 10.5427f, 17.5f)
                horizontalLineTo(8.9573f)
                curveTo(8.985f, 17.5782f, 9.0f, 17.6623f, 9.0f, 17.75f)
                curveTo(9.0f, 18.1642f, 8.6642f, 18.5f, 8.25f, 18.5f)
                horizontalLineTo(7.25f)
                curveTo(6.2835f, 18.5f, 5.5f, 19.2835f, 5.5f, 20.25f)
                verticalLineTo(21.0f)
                curveTo(5.5f, 21.4142f, 5.1642f, 21.75f, 4.75f, 21.75f)
                curveTo(4.3358f, 21.75f, 4.0f, 21.4142f, 4.0f, 21.0f)
                verticalLineTo(20.25f)
                curveTo(4.0f, 19.2448f, 4.4564f, 18.3462f, 5.1732f, 17.75f)
                curveTo(4.9987f, 17.6049f, 4.8396f, 17.4418f, 4.6988f, 17.2637f)
                curveTo(4.2612f, 16.71f, 4.0f, 16.0105f, 4.0f, 15.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.7812f, 16.2017f)
                curveTo(6.07f, 16.6466f, 6.5556f, 16.9521f, 7.1146f, 16.9948f)
                lineTo(11.4786f, 12.7132f)
                curveTo(11.7696f, 12.4277f, 12.2355f, 12.4269f, 12.5274f, 12.7116f)
                lineTo(16.9177f, 16.9921f)
                curveTo(17.4723f, 16.9394f, 17.9514f, 16.6278f, 18.233f, 16.1795f)
                lineTo(13.5746f, 11.6376f)
                curveTo(12.6987f, 10.7837f, 11.3012f, 10.7858f, 10.4281f, 11.6425f)
                lineTo(5.7812f, 16.2017f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(15.6904f, 9.0f, 16.25f, 8.4404f, 16.25f, 7.75f)
                curveTo(16.25f, 7.0596f, 15.6904f, 6.5f, 15.0f, 6.5f)
                curveTo(14.3096f, 6.5f, 13.75f, 7.0596f, 13.75f, 7.75f)
                curveTo(13.75f, 8.4404f, 14.3096f, 9.0f, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _imageReflection!!
    }

private var _imageReflection: ImageVector? = null
