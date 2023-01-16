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

public val MaterialDesignIcons.AccountSchoolOutline: ImageVector
    get() {
        if (_accountSchoolOutline != null) {
            return _accountSchoolOutline!!
        }
        _accountSchoolOutline = Builder(name = "AccountSchoolOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.5f)
                verticalLineTo(6.0f)
                lineTo(15.89f, 7.06f)
                curveTo(15.96f, 7.36f, 16.0f, 7.67f, 16.0f, 8.0f)
                curveTo(16.0f, 10.21f, 14.21f, 12.0f, 12.0f, 12.0f)
                curveTo(9.79f, 12.0f, 8.0f, 10.21f, 8.0f, 8.0f)
                curveTo(8.0f, 7.67f, 8.04f, 7.36f, 8.11f, 7.06f)
                lineTo(5.0f, 5.5f)
                lineTo(12.0f, 2.0f)
                lineTo(19.0f, 5.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(18.0f)
                moveTo(12.0f, 9.0f)
                lineTo(10.0f, 8.0f)
                curveTo(10.0f, 9.1f, 10.9f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1f, 10.0f, 14.0f, 9.1f, 14.0f, 8.0f)
                lineTo(12.0f, 9.0f)
                moveTo(14.75f, 5.42f)
                lineTo(12.16f, 4.1f)
                lineTo(9.47f, 5.47f)
                lineTo(12.07f, 6.79f)
                lineTo(14.75f, 5.42f)
                moveTo(12.0f, 13.0f)
                curveTo(14.67f, 13.0f, 20.0f, 14.33f, 20.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 14.33f, 9.33f, 13.0f, 12.0f, 13.0f)
                moveTo(12.0f, 14.9f)
                curveTo(9.0f, 14.9f, 5.9f, 16.36f, 5.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(18.1f)
                verticalLineTo(17.0f)
                curveTo(18.1f, 16.36f, 14.97f, 14.9f, 12.0f, 14.9f)
                close()
            }
        }
        .build()
        return _accountSchoolOutline!!
    }

private var _accountSchoolOutline: ImageVector? = null
