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

public val SolidGroup.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 192.0f)
                lineTo(0.1f, 192.0f)
                curveTo(2.7f, 117.9f, 41.3f, 52.9f, 99.0f, 14.1f)
                curveToRelative(13.3f, -8.9f, 30.8f, -4.3f, 39.9f, 8.8f)
                lineTo(256.0f, 192.0f)
                close()
                moveTo(384.0f, 160.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 25.2f, -5.8f, 50.2f, -17.0f, 73.5f)
                reflectiveCurveToRelative(-27.8f, 44.5f, -48.6f, 62.3f)
                reflectiveCurveToRelative(-45.5f, 32.0f, -72.7f, 41.6f)
                reflectiveCurveTo(253.4f, 416.0f, 224.0f, 416.0f)
                reflectiveCurveToRelative(-58.5f, -5.0f, -85.7f, -14.6f)
                reflectiveCurveToRelative(-51.9f, -23.8f, -72.7f, -41.6f)
                reflectiveCurveToRelative(-37.3f, -39.0f, -48.6f, -62.3f)
                reflectiveCurveTo(0.0f, 249.2f, 0.0f, 224.0f)
                lineToRelative(224.0f, 0.0f)
                lineToRelative(160.0f, 0.0f)
                lineTo(384.0f, 160.0f)
                close()
                moveTo(80.0f, 416.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
                moveTo(320.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
