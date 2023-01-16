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

public val MaterialDesignIcons.FaceWomanOutline: ImageVector
    get() {
        if (_faceWomanOutline != null) {
            return _faceWomanOutline!!
        }
        _faceWomanOutline = Builder(name = "FaceWomanOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(14.9f, 4.0f, 17.44f, 5.56f, 18.84f, 7.88f)
                curveTo(18.41f, 7.95f, 17.96f, 8.0f, 17.5f, 8.0f)
                curveTo(14.6f, 8.0f, 12.06f, 6.44f, 10.66f, 4.12f)
                curveTo(11.09f, 4.05f, 11.54f, 4.0f, 12.0f, 4.0f)
                moveTo(8.08f, 5.03f)
                curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f)
                curveTo(5.05f, 7.58f, 6.37f, 6.0f, 8.08f, 5.03f)
                moveTo(4.0f, 11.86f)
                curveTo(6.6f, 10.88f, 8.69f, 8.87f, 9.74f, 6.31f)
                curveTo(11.58f, 8.56f, 14.37f, 10.0f, 17.5f, 10.0f)
                curveTo(18.25f, 10.0f, 18.97f, 9.91f, 19.67f, 9.76f)
                curveTo(19.88f, 10.47f, 20.0f, 11.22f, 20.0f, 12.0f)
                curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(4.0f, 16.41f, 4.0f, 12.0f)
                verticalLineTo(11.86f)
                moveTo(4.0f, 20.0f)
                verticalLineTo(18.0f)
                curveTo(4.57f, 18.75f, 5.25f, 19.43f, 6.0f, 20.0f)
                horizontalLineTo(4.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(18.0f)
                curveTo(18.75f, 19.43f, 19.43f, 18.75f, 20.0f, 18.0f)
                verticalLineTo(20.0f)
                moveTo(13.75f, 13.0f)
                curveTo(13.75f, 12.31f, 14.31f, 11.75f, 15.0f, 11.75f)
                reflectiveCurveTo(16.25f, 12.31f, 16.25f, 13.0f)
                reflectiveCurveTo(15.69f, 14.25f, 15.0f, 14.25f)
                reflectiveCurveTo(13.75f, 13.69f, 13.75f, 13.0f)
                moveTo(7.75f, 13.0f)
                curveTo(7.75f, 12.31f, 8.31f, 11.75f, 9.0f, 11.75f)
                reflectiveCurveTo(10.25f, 12.31f, 10.25f, 13.0f)
                reflectiveCurveTo(9.69f, 14.25f, 9.0f, 14.25f)
                reflectiveCurveTo(7.75f, 13.69f, 7.75f, 13.0f)
                close()
            }
        }
        .build()
        return _faceWomanOutline!!
    }

private var _faceWomanOutline: ImageVector? = null
