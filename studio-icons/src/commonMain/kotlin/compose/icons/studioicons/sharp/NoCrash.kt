package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NoCrash: ImageVector
    get() {
        if (_noCrash != null) {
            return _noCrash!!
        }
        _noCrash = Builder(name = "NoCrash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.57f, 8.0f)
                horizontalLineTo(5.43f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                lineTo(18.57f, 8.0f)
                close()
                moveTo(6.85f, 10.0f)
                horizontalLineToRelative(10.29f)
                lineToRelative(1.04f, 3.0f)
                horizontalLineTo(5.81f)
                lineTo(6.85f, 10.0f)
                close()
                moveTo(6.0f, 17.5f)
                curveTo(6.0f, 16.67f, 6.67f, 16.0f, 7.5f, 16.0f)
                reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f)
                reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f)
                reflectiveCurveTo(6.0f, 18.33f, 6.0f, 17.5f)
                close()
                moveTo(15.0f, 17.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f)
                reflectiveCurveTo(15.0f, 18.33f, 15.0f, 17.5f)
                close()
                moveTo(12.0f, 6.36f)
                lineTo(9.17f, 3.54f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12.0f, 3.54f)
                lineTo(15.54f, 0.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.0f, 6.36f)
                close()
            }
        }
        .build()
        return _noCrash!!
    }

private var _noCrash: ImageVector? = null
