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

public val SolidGroup.BusinessTime: ImageVector
    get() {
        if (_businessTime != null) {
            return _businessTime!!
        }
        _businessTime = Builder(name = "BusinessTime", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 224.0f)
                curveToRelative(-79.59f, 0.0f, -144.0f, 64.41f, -144.0f, 144.0f)
                reflectiveCurveToRelative(64.41f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.41f, 144.0f, -144.0f)
                reflectiveCurveToRelative(-64.41f, -144.0f, -144.0f, -144.0f)
                close()
                moveTo(560.0f, 374.29f)
                curveToRelative(0.0f, 5.34f, -4.37f, 9.71f, -9.71f, 9.71f)
                horizontalLineToRelative(-60.57f)
                curveToRelative(-5.34f, 0.0f, -9.71f, -4.37f, -9.71f, -9.71f)
                verticalLineToRelative(-76.57f)
                curveToRelative(0.0f, -5.34f, 4.37f, -9.71f, 9.71f, -9.71f)
                horizontalLineToRelative(12.57f)
                curveToRelative(5.34f, 0.0f, 9.71f, 4.37f, 9.71f, 9.71f)
                lineTo(512.0f, 352.0f)
                horizontalLineToRelative(38.29f)
                curveToRelative(5.34f, 0.0f, 9.71f, 4.37f, 9.71f, 9.71f)
                verticalLineToRelative(12.58f)
                close()
                moveTo(496.0f, 192.0f)
                curveToRelative(5.4f, 0.0f, 10.72f, 0.33f, 16.0f, 0.81f)
                lineTo(512.0f, 144.0f)
                curveToRelative(0.0f, -25.6f, -22.4f, -48.0f, -48.0f, -48.0f)
                horizontalLineToRelative(-80.0f)
                lineTo(384.0f, 48.0f)
                curveToRelative(0.0f, -25.6f, -22.4f, -48.0f, -48.0f, -48.0f)
                lineTo(176.0f, 0.0f)
                curveToRelative(-25.6f, 0.0f, -48.0f, 22.4f, -48.0f, 48.0f)
                verticalLineToRelative(48.0f)
                lineTo(48.0f, 96.0f)
                curveToRelative(-25.6f, 0.0f, -48.0f, 22.4f, -48.0f, 48.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(395.12f)
                curveToRelative(28.6f, -20.09f, 63.35f, -32.0f, 100.88f, -32.0f)
                close()
                moveTo(320.0f, 96.0f)
                lineTo(192.0f, 96.0f)
                lineTo(192.0f, 64.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(326.82f, 320.0f)
                lineTo(208.0f, 320.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-48.0f)
                lineTo(0.0f, 256.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 25.6f, 22.4f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(291.43f)
                curveTo(327.1f, 423.96f, 320.0f, 396.82f, 320.0f, 368.0f)
                curveToRelative(0.0f, -16.66f, 2.48f, -32.72f, 6.82f, -48.0f)
                close()
            }
        }
        .build()
        return _businessTime!!
    }

private var _businessTime: ImageVector? = null
