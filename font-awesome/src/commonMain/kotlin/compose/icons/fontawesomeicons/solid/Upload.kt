package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 384.0f)
                horizontalLineToRelative(-80.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(192.0f, 192.0f)
                horizontalLineToRelative(-87.7f)
                curveToRelative(-17.8f, 0.0f, -26.7f, -21.5f, -14.1f, -34.1f)
                lineTo(242.3f, 5.7f)
                curveToRelative(7.5f, -7.5f, 19.8f, -7.5f, 27.3f, 0.0f)
                lineToRelative(152.2f, 152.2f)
                curveToRelative(12.6f, 12.6f, 3.7f, 34.1f, -14.1f, 34.1f)
                lineTo(320.0f, 192.0f)
                verticalLineToRelative(168.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(512.0f, 376.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(0.0f, 376.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(136.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 30.9f, 25.1f, 56.0f, 56.0f, 56.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, -25.1f, 56.0f, -56.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(136.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                close()
                moveTo(388.0f, 464.0f)
                curveToRelative(0.0f, -11.0f, -9.0f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 9.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                close()
                moveTo(452.0f, 464.0f)
                curveToRelative(0.0f, -11.0f, -9.0f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 9.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
