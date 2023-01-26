package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.TaxiAlert: ImageVector
    get() {
        if (_taxiAlert != null) {
            return _taxiAlert!!
        }
        _taxiAlert = Builder(name = "TaxiAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 9.68f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.42f, 1.01f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-7.68f)
                arcTo(7.01f, 7.01f, 0.0f, false, false, 23.0f, 8.0f)
                close()
                moveTo(4.5f, 8.5f)
                horizontalLineToRelative(4.53f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.08f, 4.5f)
                lineTo(3.0f, 13.0f)
                lineToRelative(1.5f, -4.5f)
                close()
                moveTo(4.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(15.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(18.43f, 12.37f)
                lineToRelative(-0.21f, 0.11f)
                lineToRelative(-0.18f, 0.09f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, -0.42f, 0.16f)
                lineToRelative(-0.22f, 0.07f)
                lineToRelative(-0.23f, 0.06f)
                lineToRelative(-0.2f, 0.05f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.94f, -4.41f)
                arcTo(4.07f, 4.07f, 0.0f, false, true, 11.0f, 8.0f)
                lineToRelative(0.02f, -0.47f)
                lineToRelative(0.02f, -0.17f)
                lineToRelative(0.04f, -0.28f)
                lineToRelative(0.04f, -0.21f)
                lineToRelative(0.05f, -0.21f)
                lineToRelative(0.07f, -0.24f)
                lineToRelative(0.05f, -0.13f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, true, 9.69f, 1.7f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, true, -2.55f, 4.38f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _taxiAlert!!
    }

private var _taxiAlert: ImageVector? = null
