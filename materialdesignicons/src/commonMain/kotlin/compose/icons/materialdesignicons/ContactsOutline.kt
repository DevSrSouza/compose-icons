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

public val MaterialDesignIcons.ContactsOutline: ImageVector
    get() {
        if (_contactsOutline != null) {
            return _contactsOutline!!
        }
        _contactsOutline = Builder(name = "ContactsOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                moveTo(4.0f, 0.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(4.0f)
                moveTo(12.0f, 12.0f)
                curveTo(13.38f, 12.0f, 14.5f, 10.88f, 14.5f, 9.5f)
                reflectiveCurveTo(13.38f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(9.5f, 8.12f, 9.5f, 9.5f)
                reflectiveCurveTo(10.62f, 12.0f, 12.0f, 12.0f)
                moveTo(12.0f, 8.5f)
                curveTo(12.55f, 8.5f, 13.0f, 8.95f, 13.0f, 9.5f)
                reflectiveCurveTo(12.55f, 10.5f, 12.0f, 10.5f)
                reflectiveCurveTo(11.0f, 10.05f, 11.0f, 9.5f)
                reflectiveCurveTo(11.45f, 8.5f, 12.0f, 8.5f)
                moveTo(17.0f, 16.0f)
                curveTo(17.0f, 13.9f, 13.69f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(7.0f, 13.9f, 7.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                moveTo(8.81f, 15.5f)
                curveTo(9.42f, 15.0f, 10.84f, 14.5f, 12.0f, 14.5f)
                curveTo(13.17f, 14.5f, 14.59f, 15.0f, 15.2f, 15.5f)
                horizontalLineTo(8.81f)
                close()
            }
        }
        .build()
        return _contactsOutline!!
    }

private var _contactsOutline: ImageVector? = null
