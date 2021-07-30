package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.0f, 448.0f)
                lineTo(112.0f, 448.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(592.0f, 128.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                curveToRelative(0.0f, 7.1f, 1.6f, 13.7f, 4.4f, 19.8f)
                lineTo(476.0f, 239.2f)
                curveToRelative(-15.4f, 9.2f, -35.3f, 4.0f, -44.2f, -11.6f)
                lineTo(350.3f, 85.0f)
                curveTo(361.0f, 76.2f, 368.0f, 63.0f, 368.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                curveToRelative(0.0f, 15.0f, 7.0f, 28.2f, 17.7f, 37.0f)
                lineToRelative(-81.5f, 142.6f)
                curveToRelative(-8.9f, 15.6f, -28.9f, 20.8f, -44.2f, 11.6f)
                lineToRelative(-72.3f, -43.4f)
                curveToRelative(2.7f, -6.0f, 4.4f, -12.7f, 4.4f, -19.8f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveTo(0.0f, 149.5f, 0.0f, 176.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                curveToRelative(2.6f, 0.0f, 5.2f, -0.4f, 7.7f, -0.8f)
                lineTo(128.0f, 416.0f)
                horizontalLineToRelative(384.0f)
                lineToRelative(72.3f, -192.8f)
                curveToRelative(2.5f, 0.4f, 5.1f, 0.8f, 7.7f, 0.8f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
