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

public val MaterialDesignIcons.AccountTieVoiceOutline: ImageVector
    get() {
        if (_accountTieVoiceOutline != null) {
            return _accountTieVoiceOutline!!
        }
        _accountTieVoiceOutline = Builder(name = "AccountTieVoiceOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 4.36f)
                curveTo(18.77f, 6.56f, 18.77f, 9.61f, 16.75f, 11.63f)
                lineTo(15.07f, 9.94f)
                curveTo(15.91f, 8.76f, 15.91f, 7.23f, 15.07f, 6.05f)
                lineTo(16.75f, 4.36f)
                moveTo(20.06f, 1.0f)
                curveTo(24.0f, 5.05f, 23.96f, 11.11f, 20.06f, 15.0f)
                lineTo(18.43f, 13.37f)
                curveTo(21.2f, 10.19f, 21.2f, 5.65f, 18.43f, 2.63f)
                lineTo(20.06f, 1.0f)
                moveTo(13.36f, 13.76f)
                curveTo(15.31f, 14.42f, 17.0f, 15.5f, 17.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                curveTo(1.0f, 15.5f, 2.69f, 14.42f, 4.65f, 13.76f)
                lineTo(5.27f, 15.0f)
                lineTo(5.5f, 15.5f)
                curveTo(4.0f, 15.96f, 2.9f, 16.62f, 2.9f, 17.0f)
                verticalLineTo(20.1f)
                horizontalLineTo(7.12f)
                lineTo(8.0f, 15.03f)
                lineTo(7.06f, 13.15f)
                curveTo(7.68f, 13.08f, 8.33f, 13.03f, 9.0f, 13.03f)
                reflectiveCurveTo(10.32f, 13.08f, 10.94f, 13.15f)
                lineTo(10.0f, 15.03f)
                lineTo(10.88f, 20.1f)
                horizontalLineTo(15.1f)
                verticalLineTo(17.0f)
                curveTo(15.1f, 16.62f, 14.0f, 15.96f, 12.5f, 15.5f)
                lineTo(12.73f, 15.0f)
                lineTo(13.36f, 13.76f)
                moveTo(9.0f, 6.0f)
                curveTo(7.9f, 6.0f, 7.0f, 6.9f, 7.0f, 8.0f)
                reflectiveCurveTo(7.9f, 10.0f, 9.0f, 10.0f)
                reflectiveCurveTo(11.0f, 9.1f, 11.0f, 8.0f)
                reflectiveCurveTo(10.1f, 6.0f, 9.0f, 6.0f)
                moveTo(9.0f, 12.0f)
                curveTo(6.79f, 12.0f, 5.0f, 10.21f, 5.0f, 8.0f)
                reflectiveCurveTo(6.79f, 4.0f, 9.0f, 4.0f)
                reflectiveCurveTo(13.0f, 5.79f, 13.0f, 8.0f)
                reflectiveCurveTo(11.21f, 12.0f, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _accountTieVoiceOutline!!
    }

private var _accountTieVoiceOutline: ImageVector? = null
