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

public val SolidGroup.HospitalUser: ImageVector
    get() {
        if (_hospitalUser != null) {
            return _hospitalUser!!
        }
        _hospitalUser = Builder(name = "HospitalUser", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 0.0f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                verticalLineTo(256.0f)
                horizontalLineTo(144.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(144.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineTo(265.9f)
                curveToRelative(-6.3f, -10.2f, -9.9f, -22.2f, -9.9f, -35.1f)
                curveToRelative(0.0f, -46.9f, 25.8f, -87.8f, 64.0f, -109.2f)
                verticalLineTo(271.8f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(152.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(184.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(152.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(152.0f)
                horizontalLineTo(112.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(120.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(512.0f, 272.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -160.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 160.0f, 0.0f)
                close()
                moveTo(288.0f, 477.1f)
                curveToRelative(0.0f, 19.3f, 15.6f, 34.9f, 34.9f, 34.9f)
                horizontalLineTo(541.1f)
                curveToRelative(19.3f, 0.0f, 34.9f, -15.6f, 34.9f, -34.9f)
                curveToRelative(0.0f, -51.4f, -41.7f, -93.1f, -93.1f, -93.1f)
                horizontalLineTo(381.1f)
                curveToRelative(-51.4f, 0.0f, -93.1f, 41.7f, -93.1f, 93.1f)
                close()
            }
        }
        .build()
        return _hospitalUser!!
    }

private var _hospitalUser: ImageVector? = null
