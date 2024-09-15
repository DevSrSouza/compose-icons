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

public val SolidGroup.PlaceOfWorship: ImageVector
    get() {
        if (_placeOfWorship != null) {
            return _placeOfWorship!!
        }
        _placeOfWorship = Builder(name = "PlaceOfWorship", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(620.61f, 366.55f)
                lineTo(512.0f, 320.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(640.0f, 395.96f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -19.39f, -29.41f)
                close()
                moveTo(0.0f, 395.96f)
                lineTo(0.0f, 496.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(112.0f)
                lineTo(128.0f, 320.0f)
                lineTo(19.39f, 366.55f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 0.0f, 395.96f)
                close()
                moveTo(464.46f, 246.68f)
                lineTo(416.0f, 217.6f)
                lineTo(416.0f, 102.63f)
                curveToRelative(0.0f, -8.49f, -3.37f, -16.62f, -9.38f, -22.63f)
                lineTo(331.31f, 4.69f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.62f, 0.0f)
                lineTo(233.38f, 80.0f)
                curveToRelative(-6.0f, 6.0f, -9.38f, 14.14f, -9.38f, 22.63f)
                lineTo(224.0f, 217.6f)
                lineToRelative(-48.46f, 29.08f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 274.12f)
                lineTo(160.0f, 512.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -35.35f, 28.66f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.65f, 64.0f, 64.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                lineTo(480.0f, 274.12f)
                curveToRelative(0.0f, -11.24f, -5.9f, -21.66f, -15.54f, -27.44f)
                close()
            }
        }
        .build()
        return _placeOfWorship!!
    }

private var _placeOfWorship: ImageVector? = null
