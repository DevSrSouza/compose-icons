package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen = Builder(name = "LockOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0039f)
                curveTo(13.8753f, 2.0039f, 15.3342f, 3.2102f, 15.9276f, 5.0069f)
                curveTo(16.0575f, 5.4002f, 15.844f, 5.8244f, 15.4507f, 5.9543f)
                curveTo(15.0574f, 6.0842f, 14.6332f, 5.8707f, 14.5033f, 5.4773f)
                curveTo(14.1018f, 4.2616f, 13.1854f, 3.5039f, 12.0f, 3.5039f)
                curveTo(10.5927f, 3.5039f, 9.5798f, 4.4618f, 9.5039f, 6.0554f)
                lineTo(9.4993f, 6.2496f)
                lineTo(9.499f, 7.9989f)
                lineTo(17.75f, 7.9996f)
                curveTo(18.9409f, 7.9996f, 19.9156f, 8.9248f, 19.9948f, 10.0956f)
                lineTo(20.0f, 10.2496f)
                verticalLineTo(19.7459f)
                curveTo(20.0f, 20.9368f, 19.0748f, 21.9116f, 17.904f, 21.9907f)
                lineTo(17.75f, 21.9959f)
                horizontalLineTo(6.25f)
                curveTo(5.0591f, 21.9959f, 4.0844f, 21.0708f, 4.0052f, 19.9f)
                lineTo(4.0f, 19.7459f)
                verticalLineTo(10.2496f)
                curveTo(4.0f, 9.0588f, 4.9252f, 8.084f, 6.096f, 8.0048f)
                lineTo(6.25f, 7.9996f)
                lineTo(7.999f, 7.9989f)
                lineTo(7.9994f, 6.2496f)
                curveTo(7.9994f, 3.7112f, 9.7084f, 2.0039f, 12.0f, 2.0039f)
                close()
                moveTo(17.75f, 9.4996f)
                horizontalLineTo(6.25f)
                curveTo(5.8703f, 9.4996f, 5.5565f, 9.7818f, 5.5068f, 10.1479f)
                lineTo(5.5f, 10.2496f)
                verticalLineTo(19.7459f)
                curveTo(5.5f, 20.1256f, 5.7821f, 20.4394f, 6.1482f, 20.4891f)
                lineTo(6.25f, 20.4959f)
                horizontalLineTo(17.75f)
                curveTo(18.1297f, 20.4959f, 18.4435f, 20.2138f, 18.4932f, 19.8477f)
                lineTo(18.5f, 19.7459f)
                verticalLineTo(10.2496f)
                curveTo(18.5f, 9.8699f, 18.2178f, 9.5562f, 17.8518f, 9.5065f)
                lineTo(17.75f, 9.4996f)
                close()
                moveTo(12.0f, 13.4992f)
                curveTo(12.8277f, 13.4992f, 13.4986f, 14.1701f, 13.4986f, 14.9978f)
                curveTo(13.4986f, 15.8254f, 12.8277f, 16.4964f, 12.0f, 16.4964f)
                curveTo(11.1723f, 16.4964f, 10.5014f, 15.8254f, 10.5014f, 14.9978f)
                curveTo(10.5014f, 14.1701f, 11.1723f, 13.4992f, 12.0f, 13.4992f)
                close()
            }
        }
        .build()
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
