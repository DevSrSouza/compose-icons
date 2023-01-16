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

public val MaterialDesignIcons.FaceWomanProfile: ImageVector
    get() {
        if (_faceWomanProfile != null) {
            return _faceWomanProfile!!
        }
        _faceWomanProfile = Builder(name = "FaceWomanProfile", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.25f, 13.0f)
                curveTo(17.25f, 13.69f, 16.69f, 14.25f, 16.0f, 14.25f)
                reflectiveCurveTo(14.75f, 13.69f, 14.75f, 13.0f)
                reflectiveCurveTo(15.31f, 11.75f, 16.0f, 11.75f)
                reflectiveCurveTo(17.25f, 12.31f, 17.25f, 13.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5f, 17.5f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(22.0f, 6.5f, 22.0f, 12.0f)
                moveTo(7.0f, 18.0f)
                curveTo(8.41f, 19.23f, 10.0f, 20.0f, 12.0f, 20.0f)
                curveTo(16.41f, 20.0f, 20.0f, 16.41f, 20.0f, 12.0f)
                curveTo(20.0f, 11.21f, 19.88f, 10.45f, 19.67f, 9.74f)
                curveTo(18.95f, 9.91f, 18.2f, 10.0f, 17.42f, 10.0f)
                curveTo(15.42f, 10.0f, 13.57f, 9.4f, 12.0f, 8.39f)
                curveTo(12.0f, 8.39f, 10.54f, 13.76f, 8.03f, 13.0f)
                curveTo(7.37f, 12.8f, 7.0f, 13.31f, 7.0f, 14.0f)
            }
        }
        .build()
        return _faceWomanProfile!!
    }

private var _faceWomanProfile: ImageVector? = null
