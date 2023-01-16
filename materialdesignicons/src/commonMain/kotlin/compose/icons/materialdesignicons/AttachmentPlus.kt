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

public val MaterialDesignIcons.AttachmentPlus: ImageVector
    get() {
        if (_attachmentPlus != null) {
            return _attachmentPlus!!
        }
        _attachmentPlus = Builder(name = "AttachmentPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 16.5f)
                horizontalLineTo(13.55f)
                curveTo(13.34f, 16.97f, 13.18f, 17.47f, 13.09f, 18.0f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 18.0f, 2.0f, 15.54f, 2.0f, 12.5f)
                reflectiveCurveTo(4.46f, 7.0f, 7.5f, 7.0f)
                horizontalLineTo(18.0f)
                curveTo(20.21f, 7.0f, 22.0f, 8.79f, 22.0f, 11.0f)
                curveTo(22.0f, 11.91f, 21.69f, 12.74f, 21.17f, 13.41f)
                curveTo(20.63f, 13.2f, 20.05f, 13.07f, 19.45f, 13.03f)
                curveTo(20.08f, 12.58f, 20.5f, 11.84f, 20.5f, 11.0f)
                curveTo(20.5f, 9.62f, 19.38f, 8.5f, 18.0f, 8.5f)
                horizontalLineTo(7.5f)
                curveTo(5.29f, 8.5f, 3.5f, 10.29f, 3.5f, 12.5f)
                reflectiveCurveTo(5.29f, 16.5f, 7.5f, 16.5f)
                moveTo(9.5f, 13.5f)
                curveTo(8.95f, 13.5f, 8.5f, 13.05f, 8.5f, 12.5f)
                reflectiveCurveTo(8.95f, 11.5f, 9.5f, 11.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 10.0f, 7.0f, 11.12f, 7.0f, 12.5f)
                reflectiveCurveTo(8.12f, 15.0f, 9.5f, 15.0f)
                horizontalLineTo(14.54f)
                curveTo(15.11f, 14.36f, 15.81f, 13.85f, 16.61f, 13.5f)
                horizontalLineTo(9.5f)
                moveTo(20.0f, 18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _attachmentPlus!!
    }

private var _attachmentPlus: ImageVector? = null
