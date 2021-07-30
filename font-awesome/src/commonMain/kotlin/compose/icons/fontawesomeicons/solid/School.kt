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

public val SolidGroup.School: ImageVector
    get() {
        if (_school != null) {
            return _school!!
        }
        _school = Builder(name = "School", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 224.0f)
                verticalLineToRelative(272.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                lineTo(96.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                close()
                moveTo(360.0f, 176.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(497.75f, 112.04f)
                lineToRelative(-160.0f, -106.67f)
                arcToRelative(32.02f, 32.02f, 0.0f, false, false, -35.5f, 0.0f)
                lineToRelative(-160.0f, 106.67f)
                arcTo(32.002f, 32.002f, 0.0f, false, false, 128.0f, 138.66f)
                lineTo(128.0f, 512.0f)
                horizontalLineToRelative(128.0f)
                lineTo(256.0f, 368.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(144.0f)
                horizontalLineToRelative(128.0f)
                lineTo(512.0f, 138.67f)
                curveToRelative(0.0f, -10.7f, -5.35f, -20.7f, -14.25f, -26.63f)
                close()
                moveTo(320.0f, 256.0f)
                curveToRelative(-44.18f, 0.0f, -80.0f, -35.82f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.82f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.82f, 80.0f, 80.0f)
                reflectiveCurveToRelative(-35.82f, 80.0f, -80.0f, 80.0f)
                close()
                moveTo(608.0f, 192.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(320.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(640.0f, 224.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _school!!
    }

private var _school: ImageVector? = null
