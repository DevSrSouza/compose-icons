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

public val MaterialDesignIcons.FaceWoman: ImageVector
    get() {
        if (_faceWoman != null) {
            return _faceWoman!!
        }
        _faceWoman = Builder(name = "FaceWoman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 13.0f)
                curveTo(13.75f, 12.31f, 14.31f, 11.75f, 15.0f, 11.75f)
                reflectiveCurveTo(16.25f, 12.31f, 16.25f, 13.0f)
                reflectiveCurveTo(15.69f, 14.25f, 15.0f, 14.25f)
                reflectiveCurveTo(13.75f, 13.69f, 13.75f, 13.0f)
                moveTo(22.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(22.0f, 6.5f, 22.0f, 12.0f)
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(20.0f, 16.41f, 20.0f, 12.0f)
                curveTo(20.0f, 11.21f, 19.88f, 10.45f, 19.67f, 9.74f)
                curveTo(18.95f, 9.91f, 18.2f, 10.0f, 17.42f, 10.0f)
                curveTo(14.05f, 10.0f, 11.07f, 8.33f, 9.26f, 5.77f)
                curveTo(8.28f, 8.16f, 6.41f, 10.09f, 4.05f, 11.14f)
                curveTo(4.0f, 11.42f, 4.0f, 11.71f, 4.0f, 12.0f)
                moveTo(9.0f, 14.25f)
                curveTo(9.69f, 14.25f, 10.25f, 13.69f, 10.25f, 13.0f)
                reflectiveCurveTo(9.69f, 11.75f, 9.0f, 11.75f)
                reflectiveCurveTo(7.75f, 12.31f, 7.75f, 13.0f)
                reflectiveCurveTo(8.31f, 14.25f, 9.0f, 14.25f)
                close()
            }
        }
        .build()
        return _faceWoman!!
    }

private var _faceWoman: ImageVector? = null
