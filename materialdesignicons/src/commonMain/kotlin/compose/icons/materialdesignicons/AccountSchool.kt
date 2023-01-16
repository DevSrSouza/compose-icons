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

public val MaterialDesignIcons.AccountSchool: ImageVector
    get() {
        if (_accountSchool != null) {
            return _accountSchool!!
        }
        _accountSchool = Builder(name = "AccountSchool", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveTo(16.0f, 10.21f, 14.21f, 12.0f, 12.0f, 12.0f)
                curveTo(9.79f, 12.0f, 8.0f, 10.21f, 8.0f, 8.0f)
                lineTo(8.11f, 7.06f)
                lineTo(5.0f, 5.5f)
                lineTo(12.0f, 2.0f)
                lineTo(19.0f, 5.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                lineTo(15.89f, 7.06f)
                lineTo(16.0f, 8.0f)
                moveTo(12.0f, 14.0f)
                curveTo(16.42f, 14.0f, 20.0f, 15.79f, 20.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 15.79f, 7.58f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _accountSchool!!
    }

private var _accountSchool: ImageVector? = null
