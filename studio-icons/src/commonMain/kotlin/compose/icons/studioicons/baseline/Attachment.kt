package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Attachment: ImageVector
    get() {
        if (_attachment != null) {
            return _attachment!!
        }
        _attachment = Builder(name = "Attachment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.5f)
                curveTo(2.0f, 9.46f, 4.46f, 7.0f, 7.5f, 7.0f)
                horizontalLineTo(18.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 15.0f, 7.0f, 13.88f, 7.0f, 12.5f)
                reflectiveCurveTo(8.12f, 10.0f, 9.5f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.41f)
                curveToRelative(-0.55f, 0.0f, -0.55f, 1.0f, 0.0f, 1.0f)
                horizontalLineTo(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(7.5f)
                curveTo(5.57f, 9.0f, 4.0f, 10.57f, 4.0f, 12.5f)
                reflectiveCurveTo(5.57f, 16.0f, 7.5f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 18.0f, 2.0f, 15.54f, 2.0f, 12.5f)
                close()
            }
        }
        .build()
        return _attachment!!
    }

private var _attachment: ImageVector? = null
