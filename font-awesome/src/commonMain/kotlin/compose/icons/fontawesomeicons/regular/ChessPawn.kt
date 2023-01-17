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

public val RegularGroup.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 463.1f)
                horizontalLineTo(23.1f)
                curveToRelative(-13.25f, 0.0f, -23.1f, 10.75f, -23.1f, 24.0f)
                reflectiveCurveToRelative(10.75f, 24.0f, 23.1f, 24.0f)
                horizontalLineToRelative(272.0f)
                curveToRelative(13.25f, 0.0f, 23.1f, -10.75f, 23.1f, -23.1f)
                reflectiveCurveTo(309.3f, 463.1f, 296.0f, 463.1f)
                close()
                moveTo(55.1f, 287.1f)
                lineTo(80.0f, 287.1f)
                verticalLineToRelative(29.5f)
                curveToRelative(0.0f, 40.25f, -3.5f, 81.25f, -23.38f, 114.5f)
                horizontalLineToRelative(53.5f)
                curveTo(125.1f, 394.1f, 128.0f, 354.6f, 128.0f, 317.5f)
                verticalLineToRelative(-29.5f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(29.5f)
                curveToRelative(0.0f, 37.13f, 2.875f, 77.5f, 17.88f, 114.5f)
                horizontalLineToRelative(53.5f)
                curveTo(243.5f, 398.7f, 240.0f, 357.7f, 240.0f, 317.5f)
                verticalLineTo(287.1f)
                lineToRelative(24.0f, -0.0f)
                curveTo(277.3f, 287.1f, 288.0f, 277.3f, 288.0f, 263.1f)
                curveToRelative(0.0f, -13.25f, -10.75f, -24.0f, -23.1f, -24.0f)
                horizontalLineTo(241.0f)
                curveToRelative(23.75f, -21.88f, 38.1f, -53.12f, 38.1f, -87.1f)
                curveToRelative(0.0f, -9.393f, -1.106f, -19.05f, -3.451f, -28.86f)
                curveTo(272.3f, 105.4f, 244.9f, 32.0f, 159.1f, 32.0f)
                curveTo(93.75f, 32.0f, 40.0f, 85.75f, 40.0f, 151.1f)
                curveToRelative(0.0f, 34.88f, 15.12f, 66.12f, 39.0f, 88.0f)
                horizontalLineTo(55.1f)
                curveTo(42.75f, 239.1f, 32.0f, 250.7f, 32.0f, 263.1f)
                curveTo(32.0f, 277.3f, 42.75f, 287.1f, 55.1f, 287.1f)
                close()
                moveTo(160.0f, 79.1f)
                curveToRelative(39.75f, 0.0f, 72.0f, 32.25f, 72.0f, 72.0f)
                reflectiveCurveTo(199.8f, 223.1f, 160.0f, 223.1f)
                reflectiveCurveTo(88.0f, 191.7f, 88.0f, 151.1f)
                reflectiveCurveTo(120.2f, 79.1f, 160.0f, 79.1f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
