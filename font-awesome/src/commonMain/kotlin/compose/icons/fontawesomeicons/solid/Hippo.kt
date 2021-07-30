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

public val SolidGroup.Hippo: ImageVector
    get() {
        if (_hippo != null) {
            return _hippo!!
        }
        _hippo = Builder(name = "Hippo", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(581.12f, 96.2f)
                curveToRelative(-27.67f, -0.15f, -52.5f, 17.58f, -76.6f, 26.62f)
                curveTo(489.98f, 88.27f, 455.83f, 64.0f, 416.0f, 64.0f)
                curveToRelative(-11.28f, 0.0f, -21.95f, 2.3f, -32.0f, 5.88f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(48.98f)
                curveTo(286.01f, 79.58f, 241.24f, 64.0f, 192.0f, 64.0f)
                curveTo(85.96f, 64.0f, 0.0f, 135.64f, 0.0f, 224.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-70.79f)
                curveTo(128.35f, 407.57f, 166.72f, 416.0f, 208.0f, 416.0f)
                reflectiveCurveToRelative(79.65f, -8.43f, 112.0f, -22.79f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-92.02f)
                curveToRelative(0.0f, -34.09f, -24.79f, -67.59f, -58.88f, -67.78f)
                close()
                moveTo(448.0f, 176.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _hippo!!
    }

private var _hippo: ImageVector? = null
