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

public val RegularGroup.Newspaper: ImageVector
    get() {
        if (_newspaper != null) {
            return _newspaper!!
        }
        _newspaper = Builder(name = "Newspaper", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 32.0f)
                horizontalLineToRelative(-304.0f)
                curveTo(121.1f, 32.0f, 96.0f, 57.13f, 96.0f, 88.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 13.22f, -10.77f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveTo(48.0f, 421.2f, 48.0f, 408.0f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, -13.25f, -10.75f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(0.0f, 98.75f, 0.0f, 112.0f)
                verticalLineToRelative(296.0f)
                curveTo(0.0f, 447.7f, 32.3f, 480.0f, 72.0f, 480.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(48.53f, 0.0f, 88.0f, -39.47f, 88.0f, -88.0f)
                verticalLineToRelative(-304.0f)
                curveTo(512.0f, 57.13f, 486.9f, 32.0f, 456.0f, 32.0f)
                close()
                moveTo(464.0f, 392.0f)
                curveToRelative(0.0f, 22.06f, -17.94f, 40.0f, -40.0f, 40.0f)
                horizontalLineTo(139.9f)
                curveTo(142.5f, 424.5f, 144.0f, 416.4f, 144.0f, 408.0f)
                verticalLineToRelative(-320.0f)
                curveToRelative(0.0f, -4.406f, 3.594f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(304.0f)
                curveToRelative(4.406f, 0.0f, 8.0f, 3.594f, 8.0f, 8.0f)
                verticalLineTo(392.0f)
                close()
                moveTo(264.0f, 272.0f)
                horizontalLineToRelative(-64.0f)
                curveTo(186.8f, 272.0f, 176.0f, 282.8f, 176.0f, 296.0f)
                reflectiveCurveTo(186.8f, 320.0f, 200.0f, 320.0f)
                horizontalLineToRelative(64.0f)
                curveTo(277.3f, 320.0f, 288.0f, 309.3f, 288.0f, 296.0f)
                reflectiveCurveTo(277.3f, 272.0f, 264.0f, 272.0f)
                close()
                moveTo(408.0f, 272.0f)
                horizontalLineToRelative(-64.0f)
                curveTo(330.8f, 272.0f, 320.0f, 282.8f, 320.0f, 296.0f)
                reflectiveCurveTo(330.8f, 320.0f, 344.0f, 320.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                reflectiveCurveTo(421.3f, 272.0f, 408.0f, 272.0f)
                close()
                moveTo(264.0f, 352.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.75f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                reflectiveCurveTo(277.3f, 352.0f, 264.0f, 352.0f)
                close()
                moveTo(408.0f, 352.0f)
                horizontalLineToRelative(-64.0f)
                curveTo(330.8f, 352.0f, 320.0f, 362.8f, 320.0f, 376.0f)
                reflectiveCurveToRelative(10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                reflectiveCurveTo(421.3f, 352.0f, 408.0f, 352.0f)
                close()
                moveTo(400.0f, 112.0f)
                horizontalLineToRelative(-192.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-64.0f)
                curveTo(432.0f, 126.3f, 417.7f, 112.0f, 400.0f, 112.0f)
                close()
            }
        }
        .build()
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
