package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) {
            return _chessBishop!!
        }
        _chessBishop = Builder(name = "ChessBishop", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 464.0f)
                horizontalLineTo(23.1f)
                curveTo(10.75f, 464.0f, 0.0f, 474.7f, 0.0f, 487.1f)
                reflectiveCurveTo(10.75f, 512.0f, 23.1f, 512.0f)
                horizontalLineToRelative(272.0f)
                curveTo(309.3f, 512.0f, 320.0f, 501.3f, 320.0f, 488.0f)
                reflectiveCurveTo(309.3f, 464.0f, 296.0f, 464.0f)
                close()
                moveTo(0.0f, 304.0f)
                curveToRelative(0.0f, 51.63f, 30.12f, 85.25f, 64.0f, 96.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(-67.13f)
                lineToRelative(-33.5f, -10.63f)
                curveTo(63.75f, 349.5f, 48.0f, 333.9f, 48.0f, 304.0f)
                curveToRelative(0.0f, -84.1f, 93.2f, -206.5f, 112.6f, -206.5f)
                curveToRelative(19.63f, 0.0f, 60.01f, 67.18f, 70.28f, 85.8f)
                lineToRelative(-66.13f, 66.13f)
                curveToRelative(-3.125f, 3.125f, -4.688f, 7.219f, -4.688f, 11.31f)
                reflectiveCurveTo(161.6f, 268.9f, 164.8f, 272.0f)
                lineTo(176.0f, 283.2f)
                curveToRelative(3.125f, 3.125f, 7.219f, 4.688f, 11.31f, 4.688f)
                reflectiveCurveToRelative(8.188f, -1.562f, 11.31f, -4.688f)
                lineTo(253.0f, 229.0f)
                curveTo(264.4f, 256.8f, 272.0f, 283.5f, 272.0f, 304.0f)
                curveToRelative(0.0f, 29.88f, -15.75f, 45.5f, -30.5f, 50.25f)
                lineTo(208.0f, 364.9f)
                verticalLineTo(432.0f)
                horizontalLineTo(256.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(33.88f, -10.75f, 64.0f, -44.38f, 64.0f, -96.0f)
                curveToRelative(0.0f, -73.38f, -67.75f, -197.2f, -120.6f, -241.5f)
                curveTo(213.4f, 59.12f, 224.0f, 47.0f, 224.0f, 32.0f)
                curveToRelative(0.0f, -17.62f, -14.38f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(128.0f)
                curveTo(110.4f, 0.0f, 96.0f, 14.38f, 96.0f, 32.0f)
                curveToRelative(0.0f, 15.0f, 10.62f, 27.12f, 24.62f, 30.5f)
                curveTo(67.75f, 106.8f, 0.0f, 230.6f, 0.0f, 304.0f)
                close()
            }
        }
        .build()
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
